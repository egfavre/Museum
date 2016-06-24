package com.egfavre.Controllers;

import com.egfavre.entities.Picture;
import com.egfavre.services.PictureRepository;
import org.springframework.beans.factory.access.BootstrapException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.aspectj.weaver.tools.cache.SimpleCacheFactory.path;

/**
 * Created by user on 6/24/16.
 */
@Controller
public class MuseumController {

    @Autowired
    PictureRepository pictures;

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
    public String gallery (HttpSession session, Model model, Integer id) {
        if (id == null) {
            id = 1;
        }

        Boolean firstPage = true;
        Boolean lastPage = false;

        if (id !=  1){
            firstPage = false;
        }


        String lastIdStr = String.valueOf(pictures.count());
        if (id == Integer.valueOf(lastIdStr)){
            lastPage = true;
        }

        Picture currentPicture = pictures.findById(id);

        model.addAttribute("currentPicture", currentPicture);

        return "gallery";
    }
}
