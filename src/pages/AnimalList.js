import React, { useState, useEffect } from 'react';
import { getAnimals } from '../services/api';
import AnimalCard from '../components/AnimalCard';

const AnimalList = () => {
  const [animals, setAnimals] = useState([]);

  useEffect(() => {
    getAnimals().then((response) => setAnimals(response.data));
  }, []);

  return (
    <div>
      <h2>Hayvan Listesi</h2>
      <div className="grid-container">
        {animals.map((animal) => (
          <AnimalCard key={animal.id} animal={animal} />
        ))}
      </div>
    </div>
  );
};

export default AnimalList;