package com.example.demo.Controller;

import com.example.demo.Service.InvoiceService;
import com.example.demo.dto.Invoice;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InvoiceController {
    @Autowired
    InvoiceService invoiceService;

    @RequestMapping("/invoice/findAll")
    public List<Invoice> findAll() {
        return invoiceService.findAll();
    }

    @RequestMapping("/invoice/{id}")
    public Invoice findById(@PathVariable Long id) { return this.invoiceService.findById(id); }

    @RequestMapping(value = "/invoice/create", method = RequestMethod.POST)
    public Invoice create(@RequestBody Invoice invoice) { return this.invoiceService.create(invoice); }
}
