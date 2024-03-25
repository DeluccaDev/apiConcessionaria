package org.DTO;

import org.springframework.lang.Nullable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class ConcessionariaDTO implements Serializable {

    private long id;
    @NotBlank(message = "Este campo é obrigatório")
    @Size(max = 100)
    private String nome;
    @NotBlank(message = "Este campo é obrigatório")
    @Size(max = 100)
    private String cidade;
    @NotBlank(message = "Este campo é obrigatório")
    private String telefone;
    @Nullable
    @Email
    private String email;

}
