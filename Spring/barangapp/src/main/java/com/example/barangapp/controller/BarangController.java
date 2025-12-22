package com.example.barangapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.barangapp.model.Barang;
import com.example.barangapp.repository.BarangRepository;

@Controller
@RequestMapping("/barang")
public class BarangController {

    @Autowired
    private BarangRepository barangRepository;

    @GetMapping
    public String listBarang(Model model) {
        model.addAttribute("listBarang", barangRepository.findAll());
        return "barang/index";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("barang", new Barang());
        return "barang/create";
    }

    @PostMapping("/create")
    public String createBarang(@ModelAttribute Barang barang) {
        barangRepository.save(barang);
        return "redirect:/barang";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        Barang barang = barangRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid barang ID: " + id));
        model.addAttribute("barang", barang);
        return "barang/edit";
    }

    @PostMapping("/edit/{id}")
    public String updateBarang(@PathVariable("id") Long id, @ModelAttribute Barang barang) {
        barang.setId(id);
        barangRepository.save(barang);
        return "redirect:/barang";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteBarang(@PathVariable("id") Long id) {
        barangRepository.deleteById(id);
        return "redirect:/barang";
    }
}
