package com.clinicmanagementsystem.web.controller;

import com.clinicmanagementsystem.dao.entity.Patient;
import com.clinicmanagementsystem.service.api.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class PatientListController {
    @RequestMapping (value = "/patients")
    public ModelAndView listOfPatients(@RequestParam (required = false) Integer page) {
        ModelAndView modelAndView = new ModelAndView("list-of-patients");

        List<Patient> patients = PatientService.getAll();
        PagedListHolder<Patient> pagedListHolder = new PagedListHolder<>(patients);
        pagedListHolder.setPageSize(5);
        modelAndView.addObject("maxPages", pagedListHolder.getPageCount());

        if (page == null || page < 1 || page > pagedListHolder.getPageCount()) page = 1;

        modelAndView.addObject("page", page);
        if (page == null || page < 1 || page > pagedListHolder.getPageCount()) {
            pagedListHolder.setPage(0);
            modelAndView.addObject("patients", pagedListHolder.getPageList());
        } else if (page <= pagedListHolder.getPageCount()) {
            pagedListHolder.setPage(page - 1);
            modelAndView.addObject("patients", pagedListHolder.getPageList());
        }
        return modelAndView;
    }
}