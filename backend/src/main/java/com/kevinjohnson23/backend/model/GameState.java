package com.kevinjohnson23.backend.model;

/**
 * Current state of a game.
 */
public enum GameState {
  /**
   * Waiting for players.
   */
  WAITING,
  /**
   * Game is starting.
   */
  STARTING,
  /**
   * Player is choosing word to draw.
   */
  CHOOSING_WORD,
  /**
   * Player is drawing chosen word.
   */
  DRAWING,
  /**
   * Chosen word is revealed.
   */
  REVEALING_WORD,
  /**
   * Winners are displayed.
   */
  END
}
