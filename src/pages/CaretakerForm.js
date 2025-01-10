import React, { useState } from 'react';
import { addCaretaker } from '../services/api';

const CaretakerForm = () => {
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const [phone, setPhone] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    addCaretaker({ name, email, phone }).then(() => {
      alert('Caretaker added successfully!');
    });
  };

  return (
    <form onSubmit={handleSubmit}>
      <h2>Add Caretaker</h2>
      <input
        type="text"
        placeholder="Name"
        value={name}
        onChange={(e) => setName(e.target.value)}
      />
      <input
        type="email"
        placeholder="Email"
        value={email}
        onChange={(e) => setEmail(e.target.value)}
      />
      <input
        type="tel"
        placeholder="Phone"
        value={phone}
        onChange={(e) => setPhone(e.target.value)}
      />
      <button type="submit">Add</button>
    </form>
  );
};

export default CaretakerForm;