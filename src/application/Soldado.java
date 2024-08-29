package application;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Soldado {
	private StringProperty nome;
	private IntegerProperty saram;
	private DoubleProperty turma;
	private StringProperty postoDeSv;
	private  Map<LocalDate, String> observacoes = new HashMap<>();
	
	
	
	
	 public Soldado(String nome, Integer saram, Double turma, String postoDeSv,
			String observaçao) {
		 this.nome = new SimpleStringProperty(nome);
	     this.saram = new SimpleIntegerProperty(saram);
	     this.turma = new SimpleDoubleProperty(turma);
	     this.postoDeSv = new SimpleStringProperty(postoDeSv);
	    // this.observaçao = new SimpleStringProperty(observaçao);
	}

	public String getNome() {
	        return nome.get();
	    }

	 public StringProperty NomeProperty() {
	        return nome;
	    }

	 
	 public int getSaram() {
	        return saram.get();
	    }

	 public IntegerProperty SaramProperty() {
	        return saram;
	    }
	
	 
	 public Double getTurma() {
	        return turma.get();
	    }

	 public DoubleProperty TurmaProperty() {
	        return turma;
	    }
	
	
	 public String getPostoDeSv() {
	        return postoDeSv.get();
	    }

	 public StringProperty PostoDeSvProperty() {
	        return  postoDeSv;
	    }

	 public StringProperty ObservacaoProperty(LocalDate data) {
	        return new SimpleStringProperty(getObservacao(data));
	    }

	    public String getObservacao(LocalDate data) {
	        return observacoes.getOrDefault(data, "");
	    }

	    public void setObservacao(LocalDate data, String observacao) {
	        observacoes.put(data, observacao);
	    }
	}

