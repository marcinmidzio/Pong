package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle
{

	public int paddleNumber;

	public int x, y, width = 50, height = 250;

	public int score;

	public Paddle(Pong pong, int paddleNumber)
	{