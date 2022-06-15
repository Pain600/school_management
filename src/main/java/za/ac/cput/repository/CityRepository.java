/* CityRepository.java
Repository interface for the City
Author: Ongezwa Gwaza (211272183)
Date: 14 June 2022
*/
package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.ac.cput.entity.City;
import za.ac.cput.entity.Country;

@Repository
public interface CityRepository extends JpaRepository<City, String> {
    City findByName(String name);
    City findByCountry(Country country);
}