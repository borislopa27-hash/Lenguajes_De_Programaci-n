module Main where

import Prelude
import Data.List (List(..), (:))
import Effect (Effect)
import Effect.Console (log)

-- Función recursiva 
sonIguales :: forall a. Eq a => List a -> List a -> Boolean
sonIguales Nil Nil = true                                 -- Caso base: ambas listas vacías
sonIguales (x : xs) (y : ys)                              -- Ambas tienen elementos: cabeza (x, y) y cola (xs, ys)
  | x == y    = sonIguales xs ys                          -- Si las cabezas coinciden, evaluamos recursivamente 
  | otherwise = false                                     -- Si son distintos, no son iguales
sonIguales _ _ = false                                    -- Caso en que una lista tiene más elementos que la otra

main :: Effect Unit
main = do
  log "--- Pruebas de sonIguales ---"
  
  -- Caso 1: Listas iguales (debe retornar true)
  log $ "Lista [1, 2, 3] y [1, 2, 3]: " <> show (sonIguales (1 : 2 : 3 : Nil) (1 : 2 : 3 : Nil))
  
  -- Caso 2: Listas de distinta longitud (debe retornar false)
  log $ "Lista [1, 2] y [1, 2, 3]: " <> show (sonIguales (1 : 2 : Nil) (1 : 2 : 3 : Nil))
  
  -- Caso 3: Mismos elementos en distinto orden o valores diferentes (debe retornar false)
  log $ "Lista [1, 2, 3] y [1, 4, 3]: " <> show (sonIguales (1 : 2 : 3 : Nil) (1 : 4 : 3 : Nil))
  
  -- Caso 4: Listas vacías (debe retornar true)
  log $ "Listas vacias: " <> show (sonIguales (Nil :: List Int) (Nil :: List Int))
