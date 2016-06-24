package com.egfavre.Controllers;

import com.egfavre.services.PictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

import static org.aspectj.weaver.tools.cache.SimpleCacheFactory.path;

/**
 * Created by user on 6/24/16.
 */
@Controller
public class MuseumController {

    @Autowired
    PictureRepository pictures;

    @RequestMapping (path = "/", method =RequestMethod.GET)
    public String home (HttpSession session) {
        return "home";
    }
}
