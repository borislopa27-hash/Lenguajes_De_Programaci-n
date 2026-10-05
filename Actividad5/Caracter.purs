module Main where

import Prelude

import Data.Foldable (any)
import Data.String.CodeUnits (toCharArray)
import Effect (Effect)
import Effect.Console (log)

-- Regresa true si el caracter c pertenece a la cadena s
pertenece :: Char -> String -> Boolean
pertenece c s = any (_ == c) (toCharArray s)

-- Pruebas
main :: Effect Unit
main = do
  log $ show (pertenece 'a' "hola")        -- true
  log $ show (pertenece 'p' "carro")        -- false
  log $ show (pertenece 'e' "pescado")  -- true
