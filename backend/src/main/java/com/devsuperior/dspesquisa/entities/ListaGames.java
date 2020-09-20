/*package com.devsuperior.dspesquisa.entities;
//essa porra nao funciona quando eu tento passar como atributo na JPA
//nao faço ideia do pq mas da uma olhada dps q tu terminar o projeto
import java.util.NoSuchElementException;

import com.devsuperior.dspesquisa.entities.enums.Platform;

//import DynamicList.Game;

//import InterfaceLista.Game;
//meio misturado com inglês mas ta nice 
public class ListaGames implements InterfaceLista {

	private int qnt = 0;
	private Game start;
	private Game end;

	public ListaGames() {
		start = end = null;
	}

	@Override
	public boolean isEmpty() {
		return qnt == 0;
	}

	@Override
	public void add(int index, Long id, String title, Platform platform, Genre genre) throws NoSuchElementException {
		if (index >= 0 && index <= qnt) {
			Game novo = new Game(id, title, platform, genre);
			// inserÃ§ao no inicio
			if (index == 0) {
				if (isEmpty()) {
					end = novo;
				}
				novo.proximo = start;
				start = novo;
			} else {
				// inserÃ§ao no fim
				if (index == qnt) {
					end.proximo = novo;
					end = novo;
				}
				// inserÃ§ao no meio
				Game aux = start;
				for (int i = 0; i < index - 1; i++) {
					aux = aux.proximo;
				}
				novo.proximo = aux.proximo;
				aux.proximo = novo;

			}
			qnt++;
		} else {
			throw new NoSuchElementException("que isso man ta loco! index invÃ¡lido...");

		}

	}

	@Override
	public int size() {
		return qnt;
	}

	@Override
	public Game remove(int index) throws IndexOutOfBoundsException {
		 Game removed = start;
	        if(!isEmpty() && index >= 0 && index < qnt){
	            //remoÃ§ao no inicio
	            if(index == 0){
	                start = start.proximo;
	                removed.proximo = null;
	                if(qnt == 1){
	                    start = end = null;
	                }
	            }else{
	                
	                //remoÃ§ao no meio
	                Game aux = start;
	                for(int i = 0;i < index-1;i++){
	                    aux = aux.proximo;
	                }
	                removed = aux.proximo;
	                aux.proximo = removed.proximo;
	                //remoÃ§ao no fim
	                if(removed == end){
	                //???????????
	                    end = aux;
	                }
	            }
	            
	            removed.proximo = null;    
	            qnt--;
	            return removed;
	        }else{
	            throw new IndexOutOfBoundsException("kkkkkkkkkkk ta moscando bixao, index invalido");
	        }
		//return index;
	}

	@Override
	public int update(int index, Long id, String title, Platform platform, Genre genre)
			throws IndexOutOfBoundsException {
		if(index>=0 && index <=qnt) {
			Game auxUpdate = new Game(id, title, platform, genre);
			Game aux = start;
			// eu nao faco ideia se esse loop realmente para no objeto que eh pra updatar
			for (int i = 0; i != index; i++) {
				aux = aux.proximo;
			}
			aux = auxUpdate;
		}else {
			throw new NoSuchElementException("que isso man ta loco! index invÃ¡lido...");
		}
		return index;
	}

	@Override
	public Game get(int index) {
		Game resultado = start;
		if (!isEmpty()) {
			for (int i = 0; i != index; i++) {
				resultado = resultado.proximo;
			}
		}
		return resultado;
	}

}*/
