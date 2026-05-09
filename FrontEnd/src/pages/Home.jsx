import { useEffect, useState } from "react";
import { getProducts } from "../services/api";

export default function Home() {

  const [products, setProducts] = useState([]);

  useEffect(() => {
    getProducts()
      .then(data => setProducts(data))
      .catch(error => console.error(error));
  }, []);

  return (
    <div className="p-10">
      <h1 className="text-3xl font-bold mb-6">
        Products
      </h1>

      <div className="grid grid-cols-3 gap-4">

        {products.map(product => (
          <div
            key={product.id}
            className="border p-4 rounded shadow"
          >
            <h2 className="font-semibold text-lg">
              {product.name}
            </h2>

            <p>{product.priceLabel}</p>

            <p>
              Stock: {product.stock}
            </p>

            <p className="text-sm text-gray-500">
              {product.categoryName}
            </p>
          </div>
        ))}

      </div>
    </div>
  );
}