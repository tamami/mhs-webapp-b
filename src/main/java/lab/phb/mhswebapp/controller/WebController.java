package lab.phb.mhswebapp.controller;

import lab.phb.mhswebapp.repo.MahasiswaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    
    @Autowired
    private MahasiswaRepo mhsRepo;
	
    @RequestMapping("/daftar-mahasiswa")
    public void daftarMahasiswa(Model model) {
        model.addAttribute("daftarMahasiswa", 
                mhsRepo.findAll());
    }
    
}
