package model;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public interface PerfumeMapper {

	List<PerfumeDTO> selectAllMenu();

	List<PerfumeDTO> selectMenuByCategoryName(String inputName);

	List<PerfumeDTO> selectMenuByCategoryName(int inputPrice);

	List<PerfumeDTO> selectMenuByPrice(Map<String, Integer> map);

	List<PerfumeDTO> selectMenuByNation(SearchCriteria searchCriteria);

	int insertMenu(PerfumeDTO perfumeDTO);

	int updateMenu(PerfumeDTO perfumeDTO);

	int deleteMenu(int inputPerfumeNo);

}
