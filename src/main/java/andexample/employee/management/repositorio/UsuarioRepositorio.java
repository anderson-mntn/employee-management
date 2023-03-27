package andexample.employee.management.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import andexample.employee.management.model.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer>{
    
}
