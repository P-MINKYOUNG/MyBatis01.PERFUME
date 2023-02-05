package views;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import controller.Controller;
import model.SearchCriteria;

public class PerfumeMenu {
	
	public void mainMenu() {

		Scanner sc = new Scanner(System.in);
		Controller controller = new Controller();

		System.out.println("====== Show your Perfume =====");
		System.out.println("1. 향수 목록 확인");
		System.out.println("2. 신규 목록 추가");
		System.out.println("3. 목록 수정");
		System.out.println("4. 목록 삭제");
		System.out.println("9. 종료");
		System.out.println("===============================");
		System.out.print("번호 입력 : ");
		int no = sc.nextInt();

		switch (no) {
		case 1:
			selectSub();
			break;
		case 2:
			controller.registMenu(inputList());
			break;
		case 3:
			controller.modifyMenu(updateList());
			break;
		case 4:
			controller.deleteMenu(inputPerfumeNo());
			break;
		case 9:
			return;
		}
	}

	private static void selectSub() {

		Scanner sc = new Scanner(System.in);
		Controller controller = new Controller();

		do {
			System.out.println("====== 향수 목록 확인 =====");
			System.out.println("1. 전체 목록 확인");
			System.out.println("2. 카테고리 명으로 목록 확인");
			System.out.println("3. 원하는 금액대 목록 확인");
			System.out.println("4. 상위 국가 카테고리별 메뉴 보여주기");
			System.out.println("9. 이전 메뉴");
			System.out.print("번호 선택 : ");
			int no = sc.nextInt();

			switch (no) {
			case 1:
				controller.selectAllMenu();
				break;
			case 2:
				controller.searchMenu(inputName());
				break;
			case 3:
				controller.searchPrice(inputPrice());
				break;
			case 4:
				controller.searchNation(inputNation());
				break;
			case 9:
				return;
			}
		} while (true);

	}
	

	private static String inputName() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("카테고리명을 입력해주세요.");
		String inputName = sc.nextLine();
		
		return inputName;
	}
	
	private static int inputPrice() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색할 금액대를 입력하세요 : ");
		int inputPrice = sc.nextInt();
		
		return inputPrice;
	}
	
	private static SearchCriteria inputNation() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("상위 분류를 입력해주세요(아시아, 유럽, 북아메리카) : ");
		String value = sc.nextLine();
		
		return new SearchCriteria("category", value);
	}
	
	
	private Map<String, String> inputList() {
		
		Map<String, String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("향수 이름 : ");
		String perfumeName = sc.nextLine();
		System.out.print("카테고리 번호 : ");
		int categoryNo = sc.nextInt();
		System.out.print("브랜드 번호 : ");
		int brandNo = sc.nextInt();
		System.out.print("용량 : ");
		int amount = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("재고 : ");
		int storageAmount = sc.nextInt();
		
		map.put("perfumeName", perfumeName);
		map.put("categoryNo", Integer.toString(categoryNo));
		map.put("brandNo", Integer.toString(brandNo));
		map.put("amount", Integer.toString(amount));
		map.put("price", Integer.toString(price));
		map.put("storageAmount", Integer.toString(storageAmount));
		
		return map;
	}
	
	private Map<String, String> updateList() {
		
		Map<String, String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========== 메뉴 수정 ==========");
		
		System.out.print("수정할 번호 : ");
		int perfumeNo = sc.nextInt();
		sc.nextLine();
		System.out.print("향수 이름 : ");
		String perfumeName = sc.nextLine();
		System.out.print("카테고리 번호 : ");
		int categoryNo = sc.nextInt();
		System.out.print("브랜드 번호 : ");
		int brandNo = sc.nextInt();
		System.out.print("용량 : ");
		int amount = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("재고 : ");
		int storageAmount = sc.nextInt();
		sc.nextLine();
		System.out.print("주문 가능 여부 : ");
		String orderableStatus = sc.nextLine();
		
		map.put("perfumeNo", Integer.toString(perfumeNo));
		map.put("perfumeName", perfumeName);
		map.put("categoryNo", Integer.toString(categoryNo));
		map.put("brandNo", Integer.toString(brandNo));
		map.put("amount", Integer.toString(amount));
		map.put("price", Integer.toString(price));
		map.put("storageAmount", Integer.toString(storageAmount));
		map.put("orderableStatus", orderableStatus);
		
		return map;
	}
	
	private int inputPerfumeNo() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("삭제할 메뉴 번호 입력 : ");
		int inputPerfumeNo = sc.nextInt();
		
		return inputPerfumeNo;
	}




}
