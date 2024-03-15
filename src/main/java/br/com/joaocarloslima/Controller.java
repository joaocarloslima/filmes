package br.com.joaocarloslima;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class Controller implements Initializable {

    // private PlayList playList = new PlayList();

    // @FXML private TextField titulo;
    // @FXML private ComboBox<Streaming> streaming;
    // @FXML private TextField nota;
    // @FXML private TextField pesquisa;
    // @FXML private TableView<Filme> tabela = new TableView<>();
    // @FXML private TableColumn<Filme, String> colunaTitulo = new TableColumn<>();
    // @FXML private TableColumn<Filme, String> colunaStreaming = new TableColumn<>();
    // @FXML private TableColumn<Filme, Integer> colunaNota = new TableColumn<>();

    // public void carregarFilmes(){
    //     tabela.getItems().clear();
    //     tabela.getItems().addAll(playList.getFilmes());
    // }

    // public void cadastrarFilmes() {
    //     try {

    //         int nota;
    //         try {
    //             nota = Integer.parseInt(this.nota.getText());
    //         } catch (NumberFormatException e) {
    //             throw new IllegalArgumentException("A nota deve ser um número");
    //         }

    //         playList.adicionar(new Filme(
    //                 this.titulo.getText(),
    //                 this.streaming.getValue(),
    //                 nota));

    //         carregarFilmes();


    //     } catch (Exception e) {
    //         Alert alert = new Alert(Alert.AlertType.ERROR);
    //         alert.setTitle("Erro");
    //         alert.setHeaderText(e.getMessage());
    //         alert.showAndWait();
    //     }

    // }

    // public void apagar(){
    //     Filme filme = tabela.getSelectionModel().getSelectedItem();
    //     if(filme != null){
    //         playList.remover(filme);
    //         carregarFilmes();
    //     }
    // }

    // public void pesquisar(){
    //     String texto = pesquisa.getText();
    //     if(texto.isEmpty()){
    //         carregarFilmes();
    //     }else{
    //         tabela.getItems().clear();
    //         playList.pesquisarPorTitulo(texto).forEach(tabela.getItems()::add);
    //     }
    // }

    // public void fechar(){
    //     Stage stage = (Stage) tabela.getScene().getWindow();
    //     stage.close();
    // }

   
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // colunaTitulo.setCellValueFactory(new PropertyValueFactory<>("titulo"));
        // colunaStreaming.setCellValueFactory(new PropertyValueFactory<>("streaming"));
        // colunaNota.setCellValueFactory(new PropertyValueFactory<>("nota"));

        // streaming.getItems().addAll(PlayList.getStreamings());

        // carregarFilmes();
        
        
    }

}
