import React, { useState, useEffect } from 'react';
{

  return (
    <div>
      <h1>Welcome to E-Store</h1>
      <p>Check out our latest products:</p>
      <ul>
        {products.map(product => (
          <li key={product.id}>
            {product.name} - ${product.price}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default EStoreHome;
