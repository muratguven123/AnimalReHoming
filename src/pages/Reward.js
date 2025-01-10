import React, { useState, useEffect } from 'react';
import { getRewards } from '../services/api';

const Rewards = () => {
  const [rewards, setRewards] = useState([]);

  useEffect(() => {
    getRewards().then((response) => setRewards(response.data));
  }, []);

  return (
    <div>
      <h2>Rewards</h2>
      <ul>
        {rewards.map((reward) => (
          <li key={reward.id}>{reward.name}</li>
        ))}
      </ul>
    </div>
  );
};

export default Rewards;