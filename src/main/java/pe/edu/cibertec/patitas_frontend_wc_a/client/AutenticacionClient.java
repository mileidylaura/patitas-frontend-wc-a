package pe.edu.cibertec.patitas_frontend_wc_a.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pe.edu.cibertec.patitas_frontend_wc_a.DTO.SignOutRequestDTO;
import pe.edu.cibertec.patitas_frontend_wc_a.DTO.SignOutResponseDTO;

@FeignClient(name = "autenticacion", url = "http://localhost:8081/autenticacion")

public interface AutenticacionClient
{
    @PostMapping("/signout")
    SignOutResponseDTO cerrarSesion(@RequestBody SignOutRequestDTO signOutRequestDTO);
}
