package org.demo19;

public class UsuarioService {
    private UsuarioRepository userRepository;

    public UsuarioService(UsuarioRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUsuarioNombre(String id) {

        Usuario u = userRepository.findById(id);

        if(u != null) {
            return u.getNombre();
        }else {
            return "Usuario no encontrado";
        }
    }



}