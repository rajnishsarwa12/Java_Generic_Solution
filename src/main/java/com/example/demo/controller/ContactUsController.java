package com.example.demo.controller;

import com.example.demo.model.ContactUs;
import com.example.demo.repository.ContactUsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
public class ContactUsController {

    private final ContactUsRepository contactUsRepository;

    public ContactUsController(ContactUsRepository contactUsRepository) {
        this.contactUsRepository = contactUsRepository;
    }

    // POST - Add new contact
    @PostMapping
    public ContactUs createContact(@RequestBody ContactUs contactUs) {
        return contactUsRepository.save(contactUs);
    }

    // GET - Get all contacts
    @GetMapping
    public List<ContactUs> getAllContacts() {
        return contactUsRepository.findAll();
    }
}
