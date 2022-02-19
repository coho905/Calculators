using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Calculus
{

    public partial class Form1 : Form
    {
        int num1;
        int num2;
        int num3;
        public Form1()
        {
            InitializeComponent();
        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {
            int n;
            bool isNumeric = int.TryParse(textBox3.Text, out n);
            if (isNumeric)
            {
                num2 = Convert.ToInt32(textBox3.Text);
            }
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            int n;
            bool isNumeric = int.TryParse(textBox1.Text, out n);
            if (isNumeric)
            {
                num1 = Convert.ToInt32(textBox1.Text);
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int newn1, newn2;
            newn1 = num1 * num2;
            newn2 = num2 - 1;
            textBox4.Text = Convert.ToString(newn1);
            textBox6.Text = Convert.ToString(newn2);
        }

        private void textBox4_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox7_TextChanged(object sender, EventArgs e)
        {

        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {
            textBox7.Text = "cos(x)";
        }

        private void radioButton2_CheckedChanged(object sender, EventArgs e)
        {
            textBox7.Text = "-sin(x)";
        }

        private void radioButton3_CheckedChanged(object sender, EventArgs e)
        {
            textBox7.Text = "sec^2(x)";
        }

        private void radioButton4_CheckedChanged(object sender, EventArgs e)
        {
            textBox7.Text = "sec(x)tan(x)";
        }

        private void radioButton5_CheckedChanged(object sender, EventArgs e)
        {
            textBox7.Text = "-csc(x)cot(x)";
        }

        private void radioButton6_CheckedChanged(object sender, EventArgs e)
        {
            textBox7.Text = "-csc^2(x)";
        }

        private void textBox8_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
