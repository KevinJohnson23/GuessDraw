package com.kevinjohnson23.backend.model;

/**
 * Current state of a room.
 */
public enum RoomState {
  /**
   * Room is open for players to join.
   */
  OPEN,
  /**
   * Room is closed; players cannot join.
   */
  CLOSED
}
