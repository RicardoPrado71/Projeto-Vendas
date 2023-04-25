package com.unifan.projetovenda;

import com.unifan.projetovenda.entity.Pessoas;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Data
@SpringBootApplication
public class ProjetoVendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoVendaApplication.class, args);
	}
     Pessoas pessoa = new Pessoas();

	pessoa.setNome("Ricardo");

}
