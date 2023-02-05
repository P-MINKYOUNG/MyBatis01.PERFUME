package controller;

import java.util.List;
import java.util.Map;

import model.PerfumeDTO;
import model.SearchCriteria;
import service.Service;
import views.PerfumeResultView;

public class Controller {

	/* 모든 목록 조회 */
	public void selectAllMenu() {

		Service service = new Service();

		List<PerfumeDTO> perfumeList = service.selectAllMenu();

		if (perfumeList != null && !perfumeList.isEmpty())
			PerfumeResultView.perfumeResultView(perfumeList);
		else
			PerfumeResultView.error("select");

	}

	/* 카테고리 이름으로 목록 조회 */
	public void searchMenu(String inputName) {

		Service service = new Service();

		List<PerfumeDTO> perfumeList = service.selectMenuByCategoryName(inputName);

		if (perfumeList != null && !perfumeList.isEmpty())
			PerfumeResultView.perfumeResultView(perfumeList);
		else
			PerfumeResultView.error("select");

	}

	public void searchPrice(int inputPrice) {

		Service service = new Service();

		List<PerfumeDTO> perfumeList = service.selectMenuByPrice(inputPrice);

		if (perfumeList != null && !perfumeList.isEmpty())
			PerfumeResultView.perfumeResultView(perfumeList);
		else
			PerfumeResultView.error("select");

	}

	public void searchNation(SearchCriteria searchCriteria) {

		Service service = new Service();

		List<PerfumeDTO> perfumeList = service.selectMenuByNation(searchCriteria);

		if (perfumeList != null && !perfumeList.isEmpty())
			PerfumeResultView.perfumeResultView(perfumeList);
		else
			PerfumeResultView.error("select");

	}

	public void registMenu(Map<String, String> map) {

		Service service = new Service();

		PerfumeDTO perfumeDTO = new PerfumeDTO();

		perfumeDTO.setPerfumeName(map.get("perfumeName"));
		perfumeDTO.setCategoryNo(Integer.parseInt(map.get("categoryNo")));
		perfumeDTO.setBrandNo(Integer.parseInt(map.get("brandNo")));
		perfumeDTO.setAmount(Integer.parseInt(map.get("amount")));
		perfumeDTO.setPrice(Integer.parseInt(map.get("price")));
		perfumeDTO.setStorageAmount(Integer.parseInt(map.get("storageAmount")));

		if (service.insertMenu(perfumeDTO))
			PerfumeResultView.suceess("insert");
		else
			PerfumeResultView.error("insert");

	}

	public void modifyMenu(Map<String, String> map) {

		Service service = new Service();

		PerfumeDTO perfumeDTO = new PerfumeDTO();

		perfumeDTO.setPerfumeName(map.get("perfumeName"));
		perfumeDTO.setCategoryNo(Integer.parseInt(map.get("categoryNo")));
		perfumeDTO.setBrandNo(Integer.parseInt(map.get("brandNo")));
		perfumeDTO.setAmount(Integer.parseInt(map.get("amount")));
		perfumeDTO.setPrice(Integer.parseInt(map.get("price")));
		perfumeDTO.setStorageAmount(Integer.parseInt(map.get("storageAmount")));
		perfumeDTO.setOrderableStatus(map.get("orderableStatus"));

		if (service.updateMenu(perfumeDTO)) PerfumeResultView.suceess("update");
		else PerfumeResultView.error("update");

	}

	public void deleteMenu(int inputPerfumeNo) {
		
		Service service = new Service();
		
		if (service.deleteMenu(inputPerfumeNo))
			PerfumeResultView.suceess("delete");
		else
			PerfumeResultView.error("delete");
	}

}
