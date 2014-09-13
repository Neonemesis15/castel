/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.castel.controllers.vendedor;

import javax.enterprise.inject.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author SABADO-MANHANA
 */
@Controller
@RequestMapping("/adm/vendedor")
public class VendedorController {
    @RequestMapping(method=RequestMethod.GET)
    public String index(Model model){
    return "vendedor/index";
    }
}
