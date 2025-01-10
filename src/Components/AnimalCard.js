import React from 'react';

const AnimalCard = ({ animal }) => {
  return (
    <div className="animal-card">
      <img src={animal.imageUrl || 'images/placeholder.jpg'} alt={animal.name} />
      <div className="animal-info">
        <h3>{animal.name}</h3>
        <p>Age: {animal.age}</p>
        <p>Size: {animal.size}</p>
        <button className="cta-button">Adopt</button>
      </div>
    </div>
  );
};

export default AnimalCard;