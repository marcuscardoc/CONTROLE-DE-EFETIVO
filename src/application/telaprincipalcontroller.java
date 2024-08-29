package application;

import java.time.LocalDate;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.AnchorPane;

public class telaprincipalcontroller {
	
 //TELA INICIAL
	    //PANE
	    @FXML
        private AnchorPane paneTelaPrincipal;
	  
	    //MENUBAR
	    @FXML
	    private MenuBar mbarTelaPrincipal;

	    //MENU
	    @FXML
	    private Menu mEditTelaPrincipal;

	    @FXML
	    private Menu mFileTelaPrincipal;

	    @FXML
	    private Menu mHelpTelaPrincipal;

	    //BOTAO
	    @FXML
        private Button btnControleMensalTelaPrincipal;
        
        @FXML
        private Button btnInspeçaoTelaPrincipal;
        
        @FXML
        private Button btnEfetivoTelaPrincipal;
        
        @FXML
        private Button btnFeriasTelaPrincipal;
        
//TELA EFETIVO(RESPONSAVEL PELO CRUD DE MANIPULAÇAO DO EFETIVO)	    
        //PANE
	    @FXML
	    private AnchorPane paneTelaEfetivo;
	    
	    //TABLE VIEW
	    @FXML
        private TableView<Soldado> tTelaEfetivo;
	   
	    //COLUMN
        @FXML
        private TableColumn<Soldado, String> tcNomeTelaEfetivo;
        
        @FXML
        private TableColumn<Soldado, Integer> tcSaramTelaEfetivo;
       
        @FXML
        private TableColumn<Soldado, Double> tcTurmaTelaEfetivo;
        
        @FXML
        private TableColumn<Soldado, String> tcPostoDeSvTelaEfetivo;
        
        @FXML
        private TableColumn<Soldado, String>  tcCpfTelaEfetivo;
        
        @FXML
        private TableColumn<Soldado, String>  tcSenhaPortalTelaEfetivo;
        
	    //TEXTFIELDS
        @FXML
        private TextField tfdNomeTelaEfetivo;
        
        @FXML
        private TextField tfPostoDeSvTelaEfetivo;
        
        @FXML
        private TextField tfSaramTelaEfetivo;
        
        @FXML
        private TextField tfTurmaTelaEfetivo;
        
        @FXML
        private TextField tfCpfTelaEfetivo;
        
        @FXML
        private TextField tfSenhaPortalTelaInicial ;
	    
        //BOTOES
        @FXML
        private Button btnAdicionarTelaEfetivo;

        @FXML
        private Button btnExcluirTelaEfetivo;

        @FXML
        private Button btnModificarTelaEfetivo;

        @FXML
        private Button btnSalvarTelaEfetivo;
        
        
//TELA CONTROLE MENSAL
        //PANE
        @FXML
        private AnchorPane controleMensalPane;
        //TABLE VIEW
        @FXML
        private TableView<Soldado> tableControleMensal;
        //COLUMN
        @FXML
        private TableColumn<Soldado, String> nomeControleMensalColumn;

        @FXML
        private TableColumn<Soldado, String> obsControleMensalColumn;
        
        @FXML
        private TableColumn<Soldado, String> postoDeSvControleMensalColumn;
        
        @FXML
        private TableColumn<Soldado, Integer> saramControleMensalColumn;
        
        @FXML
        private TableColumn<Soldado, Double> turmaControleMensalolumn;
        //TEXTFIELD
        //BOTAO
        //DATAPICKER
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	    @FXML
        private AnchorPane inspeçaoDeSaudePane;
	    
	    @FXML
        private AnchorPane controleMensalPane;
	   
	    @FXML
        private AnchorPane feriasPane;
	   
	    

	    
	    
        
        
        //TABELA CONTROLE MENSAL
        @FXML
        private TableView<Soldado> tableControleMensal;
        
        @FXML
        private TableColumn<Soldado, String> nomeControleMensalColumn;

        @FXML
        private TableColumn<Soldado, String> obsControleMensalColumn;
        
        @FXML
        private TableColumn<Soldado, String> postoDeSvControleMensalColumn;
        
        @FXML
        private TableColumn<Soldado, Integer> saramControleMensalColumn;
        
        @FXML
        private TableColumn<Soldado, Double> turmaControleMensalolumn;
        
        
        
	       //TABELA INSPEÇAO DE SAUDE
	       //TABELA FERIAS
	   
       
        @FXML
        private Button btncriar;

        @FXML
        private Button btnexcluir;

        @FXML
        private Button btnmodificar;

        @FXML
        private Button btnsalvar;
        
        @FXML
        private Button controlemensalbtn;
        
        @FXML
        private Button inspeçaobtn;
        
        @FXML
        private Button efetivobtn;
        
      
        
        @FXML
        private Label helloword;
 
 //CONTROLE MENSAL PANE
        
      

        @FXML
        private DatePicker datapicker;
        
        @FXML
        private TextField pesquisar;
        
        @FXML
        private Button btnsalvar2;

      
        
        private ObservableList<Soldado> soldadosData = FXCollections.observableArrayList();
        private FilteredList<Soldado> filteredData;
       
        @FXML
        private void addsoldado() {
        	String nome =  nomeTextField.getText();
        	String saram = saramTextField.getText();
            String turma = turmaTextField.getText();
            String postoDeSv = postoDeSvTextField.getText();
            String obs = obscmcolumn.getText();
            
            int saramm = Integer.parseInt(saram);
            Double turmaa = Double.parseDouble(turma);
            
            
           
            soldadosData.add(new Soldado(nome, saramm, turmaa, postoDeSv, obs));
            
            nomeTextField.clear();
            saramTextField.clear();
            turmaTextField.clear();
            postoDeSvTextField.clear();
            
        }
        
        @FXML
        private void initialize() {
            // Configurando a primeira tabela
            nomeColumn.setCellValueFactory(cellData -> cellData.getValue().NomeProperty());
            saramColumn.setCellValueFactory(cellData -> cellData.getValue().SaramProperty().asObject());
            turmaColumn.setCellValueFactory(cellData -> cellData.getValue().TurmaProperty().asObject());
            postoDeSvColumn.setCellValueFactory(cellData -> cellData.getValue().PostoDeSvProperty());
            tableView.setItems(soldadosData);
            //tableView.setEditable(true);


            // Configurando a segunda tabela
            nomecmcolumn.setCellValueFactory(cellData -> cellData.getValue().NomeProperty());
            saramcmcolumn.setCellValueFactory(cellData -> cellData.getValue().SaramProperty().asObject());
            turmacmcolumn.setCellValueFactory(cellData -> cellData.getValue().TurmaProperty().asObject());
            postoDeSvcmcolumn.setCellValueFactory(cellData -> cellData.getValue().PostoDeSvProperty());
            
            obscmcolumn.setCellValueFactory(cellData -> {
                Soldado soldado = cellData.getValue();
                LocalDate selectedDate = datapicker.getValue();
                return soldado.ObservacaoProperty(selectedDate);
            });
            
            efetivoesi.setEditable(true);
            obscmcolumn.setCellFactory(TextFieldTableCell.forTableColumn());
            //filteredData = new FilteredList<>(soldadosData, p -> true);
            //tornando editavel observaçao
            obscmcolumn.setOnEditCommit(event -> {
                Soldado soldado = event.getRowValue();
                LocalDate selectedDate = datapicker.getValue();
                soldado.setObservacao(selectedDate, event.getNewValue()); 
            });
            filteredData = new FilteredList<>(soldadosData, p -> true);
            efetivoesi.setItems(filteredData);

            // Adicionando o listener ao DatePicker para atualizar a TableView quando a data mudar
            datapicker.setOnAction(event -> {
                efetivoesi.refresh(); // Atualiza a TableView para mostrar as observações da data selecionada
            });
           
        }
        
      //  @FXML
       // private void salvarObs() {
       // btnsalvar2.setOnAction(event -> {
            // Itere sobre a lista de soldados e salve as observações associadas à data
         //   LocalDate selectedDate = datapicker.getValue();
         //   for (Soldado soldado : soldadosData) {
                // Implementar lógica para salvar as observações em um banco de dados ou arquivo
          //      salvarObservacao(soldado, selectedDate, soldado.getObservacao(selectedDate));
        //    }
       // });
       // }
        @FXML
        private void filtrarPorNome() {
            String filtro = pesquisar.getText().toLowerCase();
            filteredData.setPredicate(soldado -> {
                if (filtro.isEmpty() || filtro.isBlank()) {
                    return true; // Não há filtro, exibe todos os soldados
                }
                // Verifica se o nome do soldado contém o texto digitado
                return soldado.getNome().toLowerCase().contains(filtro);
            });
        }
        
        @FXML
        //manipulando datepicker
        private FilteredList<Soldado> filteredDataPicker;
        
        @FXML
        private void manipulandoDatePicker() {
        	datapicker.setOnAction(event -> {
        	    LocalDate selectedDate = datapicker.getValue();

        	 
        	    filteredDataPicker.setPredicate(soldado -> {
        	        if (selectedDate == null) {
        	            return true;
        	        }
        	        return soldado.equals(selectedDate);
        	    });
        	    });
        	    }
        
        @FXML
        private void modificarsoldado() {}
        @FXML
        private void excluirsoldado() {}
        
        
       
        
        
        public void acaoBtn(ActionEvent event) {
        	if(event.getSource() == efetivobtn ) {
        		efetivoview.setVisible(true);
        		controlemensalpane.setVisible(false);
        		inspeçaoDeSaudePane.setVisible(false);
        	}
        	else if(event.getSource() == controlemensalbtn) {
        		efetivoview.setVisible(false);
        		controlemensalpane.setVisible(true);
        		inspeçaoDeSaudePane.setVisible(false);
        	}
        	
        	else if(event.getSource() == inspeçaobtn) {
        		efetivoview.setVisible(false);
    		    controlemensalpane.setVisible(false);
    		    inspeçaoDeSaudePane.setVisible(true);
    		}
        }
        
       
      
}
