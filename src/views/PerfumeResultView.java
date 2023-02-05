package views;

import java.util.List;

import model.PerfumeDTO;

public class PerfumeResultView {

	public static void perfumeResultView(List<PerfumeDTO> perfumeList) {
		
		PerfumeDTO perfumeDTO = new PerfumeDTO();
		
		for(PerfumeDTO perfume : perfumeList) {
			System.out.println(perfume.toString());
		}
		
	}

	public static void error(String error) {
		
		switch(error) {
		case "select" : System.out.println("메뉴 목록 조회 실패\n"); break;
		case "insert" : System.out.println("메뉴 삽입 실패\n"); break;
		case "update" : System.out.println("메뉴 업데이트 실패\n"); break;
		case "delete" : System.out.println("메뉴 삭제 실패\n"); break;
		}
		
	}

	public static void suceess(String success) {
		
		switch(success) {
		case "insert" : System.out.println("메뉴 삽입 성공\n"); break;
		case "update" : System.out.println("메뉴 업데이트 성공\n"); break;
		case "delete" : System.out.println("메뉴 삭제 성공\n"); break;
		}
		
		
	}

}
