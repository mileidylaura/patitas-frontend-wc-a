package pe.edu.cibertec.patitas_frontend_wc_a.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.patitas_frontend_wc_a.DTO.SignOutRequestDTO;
import pe.edu.cibertec.patitas_frontend_wc_a.DTO.SignOutResponseDTO;
import pe.edu.cibertec.patitas_frontend_wc_a.client.AutenticacionClient;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "http://localhost:5173")
public class SignOutControllerSync {

    @Autowired
    AutenticacionClient autenticacionClient;

    @PostMapping("sign_out_sync")
    public SignOutResponseDTO signoutfeign(@RequestBody SignOutRequestDTO signOutRequestDTO) {
        try {
           SignOutResponseDTO signOutResponseDTO = autenticacionClient.cerrarSesion(signOutRequestDTO);
           return signOutResponseDTO;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return new SignOutResponseDTO("99","ERROR : " + e.getMessage());
        }
    }

}
