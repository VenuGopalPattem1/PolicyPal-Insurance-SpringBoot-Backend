package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.DcChildrenEntity;

public interface IDcChildrenRepo extends JpaRepository<DcChildrenEntity, Integer> {
	public List<DcChildrenEntity> findByCaseNumber(Integer caseNo);
}
