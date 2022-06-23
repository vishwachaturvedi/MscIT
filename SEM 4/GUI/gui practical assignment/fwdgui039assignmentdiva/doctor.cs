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
    public partial class doctor : Form
    {
        public doctor()
        {
            InitializeComponent();
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void doctor_Load(object sender, EventArgs e)
        {
            //it displays automatic datetime and day
            label1.Text = System.DateTime.Now.ToString();
            label2.Text = System.DateTime.Now.DayOfWeek.ToString();
        }

        private void label4_Click(object sender, EventArgs e)
        {

        }
    }
}
