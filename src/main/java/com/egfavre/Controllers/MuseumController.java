package com.egfavre.Controllers;

import com.egfavre.entities.Comment;
import com.egfavre.entities.Picture;
import com.egfavre.entities.User;
import com.egfavre.services.CommentRepository;
import com.egfavre.services.PictureRepository;
import com.egfavre.services.UserRepository;
import com.egfavre.utils.PasswordStorage;
import org.springframework.beans.factory.access.BootstrapException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.PostConstruct;
import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static org.aspectj.weaver.tools.cache.SimpleCacheFactory.path;

/**
 * Created by user on 6/24/16.
 */
@Controller
public class MuseumController {

    @Autowired
    PictureRepository pictures;
    @Autowired
    UserRepository users;
    @Autowired
    CommentRepository comments;

    @PostConstruct
    public void init() throws FileNotFoundException {
        if (pictures.count() == 0){
            File pictureText = new File("pictures.tsv");
            Scanner scanner =  new Scanner (pictureText);

            scanner.nextLine();

            while (scanner.hasNextLine()) {
                String pictureDetails = scanner.nextLine();
                String[] fields = pictureDetails.split("\t");
                String source = fields[0];
                String title = fields[1];
                String url = fields[2];
                String artist = fields[3];
                String description = fields[4];

                Picture picture = new Picture(source, title, url, artist, description);
                pictures.save(picture);
            }
        }
    }

    @RequestMapping (path = "/", method = RequestMethod.GET)
    public String home (HttpSession session) {
        return "home";
    }

    @RequestMapping (path = "/gallery", method = RequestMethod.GET)
    public String gallery (HttpSession session, Model model) {
        Iterable<Picture> pictureList;
        pictureList = pictures.findAll();
        model.addAttribute("picture_list", pictureList);
        return "gallery";
    }

    @RequestMapping (path = "/picture", method = RequestMethod.GET)
    public String picture (HttpSession session, Model model, int id) {
        Iterable<Picture> pictureList;
        pictureList = pictures.findAll();
        Picture currentPicture = pictures.findById(id);
        Iterable<Comment> commentList = comments.findByPicture(currentPicture);
        model.addAttribute("picture_list", pictureList);
        model.addAttribute("current_picture", currentPicture);
        model.addAttribute("commentList", commentList);
        return "picture";
    }

    @RequestMapping (path = "/login", method = RequestMethod.GET)
    public String login (HttpSession session) {
        return "loginReg";
    }

    @RequestMapping (path = "/logout", method = RequestMethod.POST)
    public String logout (HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }

    @RequestMapping (path = "/signIn", method = RequestMethod.POST)
    public String login(HttpSession session, String username, String password) throws Exception {
        User user = users.findByUsername(username);
        if (user == null){
            return "redirect:/register";
        }
        else if (!PasswordStorage.verifyPassword(password, user.getPassword())){
            throw new Exception("wrong password");
        }

        session.setAttribute("username", username);
        return "redirect:/gallery";
    }

    @RequestMapping (path = "/register", method = RequestMethod.GET)
    public String register (HttpSession session) {
        return "register";
    }

    @RequestMapping (path = "/registerSubmit", method = RequestMethod.POST)
    public String register (HttpSession session, String username, String password, String firstname, String lastname, String address, String city, String state, int zipcode, String phone, String email) throws PasswordStorage.CannotPerformOperationException {
        User user = new User(username, PasswordStorage.createHash(password), firstname, lastname, address, city, state, zipcode,phone, email);
        session.setAttribute("username", username);
        users.save(user);

        return "redirect:/gallery";
    }

    @RequestMapping (path = "/addComment", method = RequestMethod.POST)
    public String addComment (HttpSession session, String commentText, Integer pictId){
        String username = (String) session.getAttribute("username");
        User user = users.findByUsername(username);
        Picture picture = pictures.findById(pictId);
        Comment comment = new Comment(commentText, user, picture);
        comments.save(comment);
        return "redirect:/picture/?id=1";
    }
}
