module Main where

import Prelude
import Effect (Effect)

import Effect.Console (log)

-- lista ligada
data Lista
  = Vacia
  | Nodo Int Lista

-- pares en la lista
contarPares :: Lista -> Int
contarPares Vacia = 0
contarPares (Nodo x xs)
  | mod x 2 == 0 = 1 + contarPares xs
  | otherwise = contarPares xs

main :: Effect Unit
main = do
  let numeros =
        Nodo 1
          (Nodo 4
            (Nodo 7
              (Nodo 8
                (Nodo 10 Vacia))))

  log (show (contarPares numeros))
