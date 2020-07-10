package com.vastika.collegeinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.vastika.collegeinfo.model.Address;
import com.vastika.collegeinfo.service.AddressService;

import java.util.List;

@Controller
@RequestMapping("/addresss")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping
    public String findAllAddress(Model model) {
        final List<Address> addresss = addressService.getAllAddress();
        model.addAttribute("addresss", addresss);
        return "list-address";
    }

    @PostMapping
    public String createAddress(@RequestBody Address Address) {
        final Address returnedAddress = addressService.createAddress(Address);
        return "redirect:addresss";
    }

    @PutMapping
    public String updateAddress(@RequestParam Long id) {
        final Address returnedAddress = addressService.updateById(id);
        return "redirect:addresss";
    }

    @DeleteMapping
    public String deleteAddress(@RequestParam Long id) {
        addressService.deleteById(id);
        return "redirect:addresss";
    }


}
