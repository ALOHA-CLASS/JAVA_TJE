package application.controller;

import java.io.IOException;

import application.DTO.Board;
import application.service.BoardService;
import application.service.BoardServiceImpl;
import application.util.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ReadController {
	

    @FXML
    private TextField tfTitle;
    @FXML
    private TextField tfWriter;
    @FXML
    private TextArea taContent;
	
	private BoardService boardService = new BoardServiceImpl();
	
	int boardNo;
	
	// 목록 화면으로 이동
	public void moveToList(ActionEvent event) throws IOException {
		SceneUtil.getInstance().switchScene(event, UI.LIST.getPath());
	}
	
	// 수정 화면으로 이동
	public void moveToUpdate(ActionEvent event) throws IOException {
		UpdateController updateController = (UpdateController) SceneUtil.getInstance().getController(UI.UPDATE.getPath());
		updateController.read(boardNo);
		Parent root = SceneUtil.getInstance().getRoot(); 
		SceneUtil.getInstance().switchScene(event, UI.UPDATE.getPath(), root);
	}

	// 글읽기 처리
	public void read(int boardNo) {
		this.boardNo = boardNo;
		Board board = boardService.select(boardNo);
		tfTitle.setText(board.getTitle());
		tfWriter.setText(board.getWriter());
		taContent.setText(board.getContent());
	}

}







