package com.lylechristine.graphqlwithspringboot.dao.repository;

import com.lylechristine.graphqlwithspringboot.dao.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
