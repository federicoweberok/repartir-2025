package ar.com.grupoesfera.repartir.steps.grupos;

import ar.com.grupoesfera.repartir.model.Grupo;
import ar.com.grupoesfera.repartir.steps.FastCucumberSteps;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MiembrosConNombresIguales extends FastCucumberSteps {

    private Grupo grupo;
    private List<String> miembros;

    @Dado("que el usuario quiere crear un grupo")
    public void queElUsuarioQuiereCrearUnGrupo() {
        miembros = new ArrayList<>();
        grupo = new Grupo();
    }

    @Cuando("ingresa dos miembros con el nombre {string}")
    public void ingresaDosMiembrosConElNombre(String nombre) {
        miembros.add(nombre);
        miembros.add(nombre);
        grupo.setMiembros(miembros);
    }

    @Entonces("el grupo deberia crearse con ambos miembros")
    public void elGrupoDeberiaCrearseConAmbosMiembros() {
        assertThat(grupo.getMiembros().size()).isEqualTo(2);
        assertThat(grupo.estaFormado()).isTrue();
    }

}
