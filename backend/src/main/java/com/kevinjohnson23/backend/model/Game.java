package com.kevinjohnson23.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A game instance.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private GameState state;

  private String currentWord;

  private Player currentPlayer;

  private Long timeRemaining;
}
