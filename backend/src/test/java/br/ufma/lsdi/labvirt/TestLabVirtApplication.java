package br.ufma.lsdi.labvirt;

import org.springframework.boot.SpringApplication;

public class TestLabVirtApplication {

	public static void main(String[] args) {
		SpringApplication.from(LabVirtApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
