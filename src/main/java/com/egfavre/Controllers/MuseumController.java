package com.egfavre.Controllers;

import com.egfavre.entities.Picture;
import com.egfavre.services.PictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

import java.io.File;
import java.io.FileNotFoundException;
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
            File pictureText = new File("MuseumProjectPictures.txt");
            Scanner scanner =  new Scanner (pictureText);

            scanner.nextLine();
            while (scanner.hasNextLine()) {
                String pictureDetails = scanner.nextLine();
                String[] fields = pictureDetails.split("\\|");
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

    @RequestMapping (path = "/", method =RequestMethod.GET)
    public String home (HttpSession session) {
        return "home";
    }
}
