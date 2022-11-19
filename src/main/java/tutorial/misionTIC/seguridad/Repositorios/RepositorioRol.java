package tutorial.misionTIC.seguridad.Repositorios;

import org.springframework.data.mongodb.repository.Query;
import tutorial.misionTIC.seguridad.Modelos.PermisosRoles;
import tutorial.misionTIC.seguridad.Modelos.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioRol extends MongoRepository<Rol,String> {
    @Query("{'rol.$id': ObjectId(?0),'permiso.$id': ObjectId(?1)}")
    PermisosRoles getPermisoRol(String id_rol, String id_permiso);
}