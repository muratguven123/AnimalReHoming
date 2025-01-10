import React, { useState, useEffect } from 'react';
import { useParams } from 'react-router-dom';
import { getAnimalById } from '../services/api';

const AnimalDetails = () => {
  const { id } = useParams();
  const [animal, setAnimal] = useState(null);

  useEffect(() => {
    getAnimalById(id).then((response) => setAnimal(response.data));
  }, [id]);

  if (!animal) return <div>Loading...</div>;

  return (
    <div>
      <h2>{animal.name}</h2>
      <img src={animal.imageUrl || 'images/placeholder.jpg'} alt={animal.name} />
      <p>Age: {animal.age}</p>
      <p>Size: {animal.size}</p>
      <p>Description: {animal.description}</p>
    </div>
  );
};

export default AnimalDetails;