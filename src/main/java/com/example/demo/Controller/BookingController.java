package com.example.demo.Controller;

import com.example.demo.Service.BookedTableService;
import com.example.demo.dto.BookingInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class BookingController {

    @Autowired
    BookedTableService bookedTableService;

    @RequestMapping("/booking/findAll")
    public List<BookingInfo> findAll() {
        return bookedTableService.findAll();
    }

    @RequestMapping("/booking/{id}")
    public BookingInfo findById(@PathVariable Long id) { return this.bookedTableService.findById(id); }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public BookingInfo create(@RequestBody BookingInfo bookingInfo) { return this.bookedTableService.create(bookingInfo); }
}
