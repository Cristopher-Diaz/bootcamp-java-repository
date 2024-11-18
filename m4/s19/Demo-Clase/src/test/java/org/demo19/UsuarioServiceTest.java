package org.demo19;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


@DisplayName("Pruebas para el servicio de usuarios - UsuarioService")
class UsuarioServiceTest {

    @Mock  //que se va simular
    private UsuarioRepository usuarioRepository;

    @InjectMocks //donde se realiza la simulación
    private UsuarioService usuarioService;

    @BeforeEach
    public void setUp(){ //Método que inicializa las anotaciones
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Debe devolver el nombre de usuario cuando el usuario es encontrado")
    public void getUsuarioNombre_encontrado() {

        //Creamos mock del usuario
        Usuario usuario = new Usuario("1", "Maria");

        //Configura el comportamiento del mock
        when(usuarioRepository.findById("1")).thenReturn(usuario);

        //Ejecutar el método a probar
        String nombreUsuario = usuarioService.getUsuarioNombre("1");

        //Verificación del resultado
        assertEquals("Maria", nombreUsuario);
    }

    @Test
    @DisplayName("Debe devolver 'Usuario no encontrado' cuando usuario no existe")
    public void getUsuarioNombre_no_encontrado() {

        //Configura el comportamiento del mock
        when(usuarioRepository.findById("2")).thenReturn(null);

        //Ejecutar el método a probar
        String nombreUsuario = usuarioService.getUsuarioNombre("2");

        //Verificación del resultado
        assertEquals("Usuario no encontrado", nombreUsuario);

    }



}