package andexample.employee.management;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import andexample.employee.management.model.Usuario;
import andexample.employee.management.repositorio.UsuarioRepositorio;

public class StartApp implements CommandLineRunner{
    @Autowired
    private UsuarioRepositorio repositorio;
    @Override
    public void run(String... args) throws Exception {

        Usuario usuario1 = new Usuario();

        usuario1.setName("Carlos");
        usuario1.setUsername("Caca");
        usuario1.setUsername("coxinha123");
        
        repositorio.save(usuario1);

        for(Usuario u : repositorio.findAll()){
            System.out.println(u);
        }
    }
    
}
