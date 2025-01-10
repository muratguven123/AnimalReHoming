import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Home from './pages/Home';
import Login from './pages/Login';
import Register from './pages/Register';
import AnimalList from './pages/AnimalList';
import AnimalDetails from './pages/AnimalDetails';
import CaretakerForm from './pages/CaretakerForm';
import Rewards from './pages/Rewards';
import Header from './components/Header';
import Footer from './components/Footer';

import axios from 'axios';

const API_BASE_URL = 'http://localhost:8080';

export const getAnimals = () => axios.get(`${API_BASE_URL}/animals`);
export const getAnimalById = (id) => axios.get(`${API_BASE_URL}/animals/${id}`);
export const addCaretaker = (caretakerData) => axios.post(`${API_BASE_URL}/caretakers`, caretakerData);
export const getRewards = () => axios.get(`${API_BASE_URL}/rewards`);

const App = () => {
  return (
    <Router>
      <Header />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/login" element={<Login />} />
        <Route path="/register" element={<Register />} />
        <Route path="/animals" element={<AnimalList />} />
        <Route path="/animals/:id" element={<AnimalDetails />} />
        <Route path="/add-caretaker" element={<CaretakerForm />} />
        <Route path="/rewards" element={<Rewards />} />
      </Routes>
      <Footer />
    </Router>
  );
};

export default App;