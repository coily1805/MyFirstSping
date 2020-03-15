/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Message;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author user
 */
@Controller
public class MessageController {

    /**
     * the default constructor
     */
    public MessageController() {
    }

    /**
     * shows all the messages from the database
     *
     * @param model
     * @return view messages.jsp
     */
    @RequestMapping(value = "/message/all", method = RequestMethod.GET)
    public String showMessages(ModelMap model) {
        List<Message> msgs = new ArrayList<>();
        // msgs = messageService.findAll();
        model.addAttribute("msgs", msgs);
        return ("messages");
    }

    /**
     * show a single message like
     * http://localhost:8081/MyFirstSping/message/message?id=1
     *
     * @param model
     * @param id
     * @return view message.jsp
     */
    @RequestMapping(value = "/message", method = RequestMethod.GET)
    public String showMessage(ModelMap model, @RequestParam("id") String id) {
        Message msg = null;
        // msg = messageService.getMessage(id);
        model.addAttribute("id", id);
        model.addAttribute("msg", msg);
        return ("message");
    }

    /**
     * shows the message form for a new message
     *
     * @param model
     * @return view message-form.jsp
     */
    @RequestMapping(value = "/message/new", method = RequestMethod.GET)
    public String newMessage(ModelMap model) {
        Message msg = new Message();
        model.addAttribute("title", "New");
        model.addAttribute("button", "Save New Message");
        model.addAttribute("msg", msg);
        return ("message-form");
    }
    
    /**
     * shows the message form for saving or updating a message
     * 
     * @param model
     * @param description
     * @param date
     * @return view message-form.jsp
     */
    @RequestMapping(value = "/message/update", method = RequestMethod.GET)
    public String updateMessage(ModelMap model, @RequestParam("id") String id) {
        // Message msg = messageService.findById(id);
        model.addAttribute("title", "Save / Update");
        model.addAttribute("button", "Save / Update a Message");
//        model.addAttribute(msg);
        return ("message-form");
    }
    
    /**
     * saves a newly written message
     * 
     * @param model
     * @param description
     * @param date
     * @return view message-form.jsp
     */
    @RequestMapping(value = "/message/save", method = RequestMethod.POST)
    public String saveMessage(ModelMap model, @RequestParam("description") String description, @RequestParam("date") String date) {
        model.addAttribute("title", "Save / Update");
        
        boolean result = false;
//        Message msg = new Message(description, date);
//        result = messageService.save(msg);
        if (result) {
            model.addAttribute("result", "Message has been stored correctly to the database!");
        } else {
            model.addAttribute("result", "Message has not been stored correctly to the database!");
        }
        return ("message-save-update");
    }

    /**
     * saves an updated message
     *
     * @param model
     * @param id
     * @param description
     * @param date
     * @return view message-form.jsp
     */
    @RequestMapping(value = "/message/update", method = RequestMethod.POST)
    public String updateMessage(ModelMap model, @RequestParam("id") String id, @RequestParam("description") String description, @RequestParam("date") String date) {
        model.addAttribute("title", "Update");
        model.addAttribute("button", "Update Message");
        boolean result = false;
//        Message msg = messageService.findById(id);
//        msg.setDescription(description);
//        msg.setDate(date);
//        result = messageService.save(msg);
        if (result) {
            model.addAttribute("result", "Message has been stored correctly to the database!");
        } else {
            model.addAttribute("result", "Message has not been stored correctly to the database!");
        }
        return ("message-form");
    }

    /**
     * delete a single message
     *
     * @param model
     * @param id
     * @return view delete.jsp
     */
    @RequestMapping(value = "/message/delete", method = RequestMethod.GET)
    public String deleteMessage(ModelMap model, @RequestParam("id") String id) {
        boolean result = false;
        // result = messageService.deleteMessage(id);
        if (result) {
            model.addAttribute("result", "Message with id: " + id + " deleted succesfully!");
        } else {
            model.addAttribute("result", "Message with id: " + id + " was not deleted!!!!");
        }
        return ("delete");
    }
}
