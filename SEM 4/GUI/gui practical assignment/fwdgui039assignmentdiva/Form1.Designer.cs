namespace practical_cie2_039
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.panel1 = new System.Windows.Forms.Panel();
            this.tabControl1 = new System.Windows.Forms.TabControl();
            this.tabPage1 = new System.Windows.Forms.TabPage();
            this.tabPage2 = new System.Windows.Forms.TabPage();
            this.panel2 = new System.Windows.Forms.Panel();
            this.btnLogin_a = new System.Windows.Forms.Button();
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.txtboxPasword_a = new System.Windows.Forms.TextBox();
            this.txtboxName_a = new System.Windows.Forms.TextBox();
            this.panel3 = new System.Windows.Forms.Panel();
            this.btnLogin_d = new System.Windows.Forms.Button();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.txtboxPassword_d = new System.Windows.Forms.TextBox();
            this.txtboxUsername_d = new System.Windows.Forms.TextBox();
            this.btnExit_d = new System.Windows.Forms.Button();
            this.btnExit_a = new System.Windows.Forms.Button();
            this.label5 = new System.Windows.Forms.Label();
            this.panel1.SuspendLayout();
            this.tabControl1.SuspendLayout();
            this.tabPage1.SuspendLayout();
            this.tabPage2.SuspendLayout();
            this.panel2.SuspendLayout();
            this.panel3.SuspendLayout();
            this.SuspendLayout();
            // 
            // panel1
            // 
            this.panel1.BackColor = System.Drawing.SystemColors.ButtonHighlight;
            this.panel1.Controls.Add(this.label5);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel1.Location = new System.Drawing.Point(0, 0);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(1321, 100);
            this.panel1.TabIndex = 0;
            // 
            // tabControl1
            // 
            this.tabControl1.Controls.Add(this.tabPage1);
            this.tabControl1.Controls.Add(this.tabPage2);
            this.tabControl1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.tabControl1.Location = new System.Drawing.Point(0, 100);
            this.tabControl1.Name = "tabControl1";
            this.tabControl1.SelectedIndex = 0;
            this.tabControl1.Size = new System.Drawing.Size(1321, 617);
            this.tabControl1.TabIndex = 6;
            this.tabControl1.Tag = "";
            // 
            // tabPage1
            // 
            this.tabPage1.Controls.Add(this.panel2);
            this.tabPage1.Location = new System.Drawing.Point(4, 25);
            this.tabPage1.Name = "tabPage1";
            this.tabPage1.Padding = new System.Windows.Forms.Padding(3);
            this.tabPage1.Size = new System.Drawing.Size(1272, 570);
            this.tabPage1.TabIndex = 0;
            this.tabPage1.Text = "Admin  Login";
            this.tabPage1.UseVisualStyleBackColor = true;
            // 
            // tabPage2
            // 
            this.tabPage2.Controls.Add(this.panel3);
            this.tabPage2.Location = new System.Drawing.Point(4, 25);
            this.tabPage2.Name = "tabPage2";
            this.tabPage2.Padding = new System.Windows.Forms.Padding(3);
            this.tabPage2.Size = new System.Drawing.Size(1313, 588);
            this.tabPage2.TabIndex = 1;
            this.tabPage2.Text = "Doctor Login";
            this.tabPage2.UseVisualStyleBackColor = true;
            this.tabPage2.Click += new System.EventHandler(this.tabPage2_Click);
            // 
            // panel2
            // 
            this.panel2.BackColor = System.Drawing.SystemColors.ControlDark;
            this.panel2.Controls.Add(this.btnExit_a);
            this.panel2.Controls.Add(this.btnLogin_a);
            this.panel2.Controls.Add(this.label2);
            this.panel2.Controls.Add(this.label1);
            this.panel2.Controls.Add(this.txtboxPasword_a);
            this.panel2.Controls.Add(this.txtboxName_a);
            this.panel2.Location = new System.Drawing.Point(353, 76);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(566, 418);
            this.panel2.TabIndex = 6;
            // 
            // btnLogin_a
            // 
            this.btnLogin_a.BackColor = System.Drawing.SystemColors.ButtonHighlight;
            this.btnLogin_a.Font = new System.Drawing.Font("Arial Rounded MT Bold", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnLogin_a.Location = new System.Drawing.Point(134, 318);
            this.btnLogin_a.Name = "btnLogin_a";
            this.btnLogin_a.Size = new System.Drawing.Size(115, 46);
            this.btnLogin_a.TabIndex = 5;
            this.btnLogin_a.Text = "Login";
            this.btnLogin_a.UseVisualStyleBackColor = false;
            this.btnLogin_a.Click += new System.EventHandler(this.btnLogin_a_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(104, 198);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(106, 25);
            this.label2.TabIndex = 4;
            this.label2.Text = "Password";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(104, 107);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(110, 25);
            this.label1.TabIndex = 3;
            this.label1.Text = "Username";
            // 
            // txtboxPasword_a
            // 
            this.txtboxPasword_a.Location = new System.Drawing.Point(253, 201);
            this.txtboxPasword_a.Name = "txtboxPasword_a";
            this.txtboxPasword_a.Size = new System.Drawing.Size(202, 22);
            this.txtboxPasword_a.TabIndex = 2;
            // 
            // txtboxName_a
            // 
            this.txtboxName_a.Location = new System.Drawing.Point(253, 111);
            this.txtboxName_a.Name = "txtboxName_a";
            this.txtboxName_a.Size = new System.Drawing.Size(202, 22);
            this.txtboxName_a.TabIndex = 1;
            // 
            // panel3
            // 
            this.panel3.BackColor = System.Drawing.SystemColors.ControlDark;
            this.panel3.Controls.Add(this.btnExit_d);
            this.panel3.Controls.Add(this.btnLogin_d);
            this.panel3.Controls.Add(this.label3);
            this.panel3.Controls.Add(this.label4);
            this.panel3.Controls.Add(this.txtboxPassword_d);
            this.panel3.Controls.Add(this.txtboxUsername_d);
            this.panel3.Location = new System.Drawing.Point(353, 76);
            this.panel3.Name = "panel3";
            this.panel3.Size = new System.Drawing.Size(566, 418);
            this.panel3.TabIndex = 6;
            // 
            // btnLogin_d
            // 
            this.btnLogin_d.BackColor = System.Drawing.SystemColors.ButtonHighlight;
            this.btnLogin_d.Font = new System.Drawing.Font("Arial Rounded MT Bold", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnLogin_d.Location = new System.Drawing.Point(143, 313);
            this.btnLogin_d.Name = "btnLogin_d";
            this.btnLogin_d.Size = new System.Drawing.Size(115, 46);
            this.btnLogin_d.TabIndex = 5;
            this.btnLogin_d.Text = "Login";
            this.btnLogin_d.UseVisualStyleBackColor = false;
            this.btnLogin_d.Click += new System.EventHandler(this.btnLogin_d_Click);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(104, 198);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(106, 25);
            this.label3.TabIndex = 4;
            this.label3.Text = "Password";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(104, 107);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(110, 25);
            this.label4.TabIndex = 3;
            this.label4.Text = "Username";
            // 
            // txtboxPassword_d
            // 
            this.txtboxPassword_d.Location = new System.Drawing.Point(253, 201);
            this.txtboxPassword_d.Name = "txtboxPassword_d";
            this.txtboxPassword_d.Size = new System.Drawing.Size(202, 22);
            this.txtboxPassword_d.TabIndex = 2;
            // 
            // txtboxUsername_d
            // 
            this.txtboxUsername_d.Location = new System.Drawing.Point(253, 111);
            this.txtboxUsername_d.Name = "txtboxUsername_d";
            this.txtboxUsername_d.Size = new System.Drawing.Size(202, 22);
            this.txtboxUsername_d.TabIndex = 1;
            // 
            // btnExit_d
            // 
            this.btnExit_d.BackColor = System.Drawing.SystemColors.ButtonHighlight;
            this.btnExit_d.Font = new System.Drawing.Font("Arial Rounded MT Bold", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnExit_d.Location = new System.Drawing.Point(351, 313);
            this.btnExit_d.Name = "btnExit_d";
            this.btnExit_d.Size = new System.Drawing.Size(115, 46);
            this.btnExit_d.TabIndex = 6;
            this.btnExit_d.Text = "Exit";
            this.btnExit_d.UseVisualStyleBackColor = false;
            this.btnExit_d.Click += new System.EventHandler(this.btnExit_d_Click);
            // 
            // btnExit_a
            // 
            this.btnExit_a.BackColor = System.Drawing.SystemColors.ButtonHighlight;
            this.btnExit_a.Font = new System.Drawing.Font("Arial Rounded MT Bold", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnExit_a.Location = new System.Drawing.Point(316, 318);
            this.btnExit_a.Name = "btnExit_a";
            this.btnExit_a.Size = new System.Drawing.Size(115, 46);
            this.btnExit_a.TabIndex = 7;
            this.btnExit_a.Text = "Exit";
            this.btnExit_a.UseVisualStyleBackColor = false;
            this.btnExit_a.Click += new System.EventHandler(this.btnExit__Click);
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Arial Rounded MT Bold", 25.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.Location = new System.Drawing.Point(321, 18);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(658, 51);
            this.label5.TabIndex = 0;
            this.label5.Text = "Hospital Management System";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ControlDark;
            this.ClientSize = new System.Drawing.Size(1321, 717);
            this.Controls.Add(this.tabControl1);
            this.Controls.Add(this.panel1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.tabControl1.ResumeLayout(false);
            this.tabPage1.ResumeLayout(false);
            this.tabPage2.ResumeLayout(false);
            this.panel2.ResumeLayout(false);
            this.panel2.PerformLayout();
            this.panel3.ResumeLayout(false);
            this.panel3.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.TabControl tabControl1;
        private System.Windows.Forms.TabPage tabPage1;
        private System.Windows.Forms.TabPage tabPage2;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.Button btnLogin_a;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox txtboxPasword_a;
        private System.Windows.Forms.TextBox txtboxName_a;
        private System.Windows.Forms.Panel panel3;
        private System.Windows.Forms.Button btnLogin_d;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox txtboxPassword_d;
        private System.Windows.Forms.TextBox txtboxUsername_d;
        private System.Windows.Forms.Button btnExit_a;
        private System.Windows.Forms.Button btnExit_d;
        private System.Windows.Forms.Label label5;
    }
}

