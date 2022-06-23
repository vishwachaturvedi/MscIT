using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace practical_cie2_039
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void btnExit__Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btnExit_d_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btnLogin_a_Click(object sender, EventArgs e)
        {
            admin a = new admin();
            a.Show();
            this.Hide();
        }

        private void btnLogin_d_Click(object sender, EventArgs e)
        {

            doctor d = new doctor();
            d.Show();
            this.Hide();
        }

        private void tabPage2_Click(object sender, EventArgs e)
        {

        }
    }
}
