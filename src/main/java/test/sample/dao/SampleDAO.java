package test.sample.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import test.common.dao.AbstractDAO;

@Repository("sampleDAO")
public class SampleDAO extends AbstractDAO {

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>) selectList("sample.selectBoardList", map);
	}

	public void updateHitCnt(Map<String, Object> map) throws Exception{
	    update("sample.updateHitCnt", map);
	}
	 
	@SuppressWarnings("unchecked")
	public Map<String, Object> selectBoardDetail(Map<String, Object> map) throws Exception{
	    return (Map<String, Object>) selectOne("sample.selectBoardDetail", map);
	}

	public void insertBoard(Map<String, Object> map) throws Exception{
		//.xml의 namespace 따라감 =>  sample
	    insert("sample.insertBoard", map);
	}

	public void updateBoard(Map<String, Object> map) throws Exception{
	    update("sample.updateBoard", map);
	}

	public void deleteBoard(Map<String, Object> map) {
		// TODO Auto-generated method stub
		update("sample.deleteBoard", map);
		
	}

	public void insertFile(Map<String, Object> map) throws Exception{
	    insert("sample.insertFile", map);
	}


		
}
