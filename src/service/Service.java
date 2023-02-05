package service;

import static common.Template.getSqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import model.PerfumeDTO;
import model.PerfumeMapper;
import model.SearchCriteria;

public class Service {

	private PerfumeMapper mapper;

	public List<PerfumeDTO> selectAllMenu() {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(PerfumeMapper.class);

		List<PerfumeDTO> perfumeList = mapper.selectAllMenu();
		
		sqlSession.close();

		return perfumeList;
	}

	public List<PerfumeDTO> selectMenuByCategoryName(String inputName) {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(PerfumeMapper.class);
		
		List<PerfumeDTO> perfumeList = mapper.selectMenuByCategoryName(inputName);
		
		sqlSession.close();
		
		return perfumeList;
	}

	public List<PerfumeDTO> selectMenuByPrice(int price) {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(PerfumeMapper.class);
		
		Map<String, Integer> map = new HashMap<>();
		map.put("price", price);
		
		List<PerfumeDTO> perfumeList = mapper.selectMenuByPrice(map);
		
		sqlSession.close();
		
		return perfumeList;
	}

	public List<PerfumeDTO> selectMenuByNation(SearchCriteria searchCriteria) {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(PerfumeMapper.class);
		
		List<PerfumeDTO> perfumeList = mapper.selectMenuByNation(searchCriteria);
		
		sqlSession.close();
		
		return perfumeList;
	}

	public boolean insertMenu(PerfumeDTO perfumeDTO) {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(PerfumeMapper.class);
		
		int result = mapper.insertMenu(perfumeDTO);
		
		if(result > 0) sqlSession.commit();
		else sqlSession.rollback();
		
		sqlSession.close();
		
		return result>0 ? true : false;
	}

	public boolean updateMenu(PerfumeDTO perfumeDTO) {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(PerfumeMapper.class);
		
		int result = mapper.updateMenu(perfumeDTO);
		
		if(result > 0) sqlSession.commit();
		else sqlSession.rollback();
		
		sqlSession.close();
		
		return result>0 ? true : false;
	}

	public boolean deleteMenu(int inputPerfumeNo) {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(PerfumeMapper.class);
		
		int result = mapper.deleteMenu(inputPerfumeNo);
		
		if(result > 0) sqlSession.commit();
		else sqlSession.rollback();
		
		sqlSession.close();
		
		return result>0 ? true : false;
	}

}
